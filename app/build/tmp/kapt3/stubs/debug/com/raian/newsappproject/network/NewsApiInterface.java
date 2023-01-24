package com.raian.newsappproject.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/raian/newsappproject/network/NewsApiInterface;", "", "getBusiness", "Lcom/raian/newsappproject/models/NewsDatAaSource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScience", "getSports", "getTechnology", "app_debug"})
public abstract interface NewsApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines?country=us&category=business&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    public abstract java.lang.Object getBusiness(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.raian.newsappproject.models.NewsDatAaSource> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines?country=us&category=sports&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    public abstract java.lang.Object getSports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.raian.newsappproject.models.NewsDatAaSource> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines?country=us&category=science&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    public abstract java.lang.Object getScience(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.raian.newsappproject.models.NewsDatAaSource> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "top-headlines?country=us&category=technology&apiKey=98d7f1e882bf4a16874d71e0258b81c2")
    public abstract java.lang.Object getTechnology(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.raian.newsappproject.models.NewsDatAaSource> continuation);
}