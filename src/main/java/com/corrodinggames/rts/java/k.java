/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.config.RequestConfig$Builder
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClientBuilder
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.j.r;
import com.corrodinggames.rts.gameFramework.l;
import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class k
extends r {
    @Override
    public HttpClient a(int n2, boolean bl2) {
        RequestConfig.Builder builder = RequestConfig.custom();
        builder = builder.setConnectTimeout(n2);
        builder = builder.setConnectionRequestTimeout(n2);
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        httpClientBuilder.setDefaultRequestConfig(builder.build());
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        return closeableHttpClient;
    }

    @Override
    public void a(HttpClient httpClient) {
        if (httpClient instanceof CloseableHttpClient) {
            CloseableHttpClient closeableHttpClient = (CloseableHttpClient)httpClient;
            try {
                closeableHttpClient.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else {
            l.e("closeHttpClient: Didn't close");
        }
    }
}

