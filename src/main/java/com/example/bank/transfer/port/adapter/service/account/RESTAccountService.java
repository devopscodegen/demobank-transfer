package com.example.bank.transfer.port.adapter.service.account;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.jmolecules.architecture.hexagonal.Adapter;
import org.springframework.http.MediaType;

import com.example.bank.transfer.domain.model.account.AccountId;
import com.example.bank.transfer.domain.model.account.AccountService;
import com.example.bank.transfer.domain.model.account.transaction.Transaction;
import com.example.bank.transfer.domain.model.account.transaction.TransactionId;
import com.example.bank.transfer.domain.model.account.transaction.TransactionStatus;
import com.example.bank.transfer.domain.model.currency.CurrencyCode;
import com.example.bank.transfer.domain.model.money.Money;
import com.example.bank.transfer.port.adapter.service.account.transaction.TransactionRequest;
import com.example.bank.transfer.port.adapter.service.account.transaction.TransactionResponse;

@Service
@Adapter
public class RESTAccountService implements AccountService {

    private String baseUrl;

    private RestClient restClient;

    private RestClient.Builder restClientBuilder;

    public RESTAccountService() {
        super();
        this.setBaseUrl("http://localhost:8080/api/v1/account");
        this.setRestClientBuilder(RestClient.builder());
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(this.getBaseUrl());
        this.setRestClient(this.getRestClientBuilder().uriBuilderFactory(factory).build());
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public RestClient getRestClient() {
        return restClient;
    }

    private void setRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public RestClient.Builder getRestClientBuilder() {
        return restClientBuilder;
    }

    private void setRestClientBuilder(RestClient.Builder restClientBuilder) {
        this.restClientBuilder = restClientBuilder;
    }

    public Transaction debitAmountFromAccount(AccountId accountId, Money amount) {
        TransactionResponse transactionResponse = this.getRestClient().post()
            .uri("/{accountId}/debit", accountId.getId())
            .contentType(MediaType.APPLICATION_JSON)
            .body(new TransactionRequest(
                amount.getAmount(), 
                amount.getCurrencyCode().toString())
            )
            .retrieve()
            .body(TransactionResponse.class);
        
        return new Transaction(
            new TransactionId(transactionResponse.getTransactionId()), 
            accountId, 
            amount,
            TransactionStatus.valueOf(transactionResponse.getStatus()), 
            new Money(
                transactionResponse.getNewBalance(), 
                CurrencyCode.valueOf(transactionResponse.getNewBalanceCurrencyCode())
            )
        );
    }

    public Transaction creditAmountToAccount(AccountId accountId, Money amount) {
        TransactionResponse transactionResponse = this.getRestClient().post()
            .uri("/{accountId}/credit", accountId.getId())
            .contentType(MediaType.APPLICATION_JSON)
            .body(new TransactionRequest(
                amount.getAmount(), 
                amount.getCurrencyCode().toString())
            )
            .retrieve()
            .body(TransactionResponse.class);
        
        return new Transaction(
            new TransactionId(transactionResponse.getTransactionId()), 
            accountId, 
            amount,
            TransactionStatus.valueOf(transactionResponse.getStatus()), 
            new Money(
                transactionResponse.getNewBalance(), 
                CurrencyCode.valueOf(transactionResponse.getNewBalanceCurrencyCode())
            )
        );
    }
}
