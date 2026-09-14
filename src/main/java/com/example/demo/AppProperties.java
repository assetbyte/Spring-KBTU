package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

   private String name;
   private int maxUsers;
   private int timeout;

   public String getName(){
    return this.name;
   }

   public void setName(String newName){
       this.name = newName;
   }

   public int getMaxUsers() {
       return this.maxUsers;
   }

   public void setMaxUsers(int newMaxUsers){
       this.maxUsers = newMaxUsers;
   }

   public int getTimeout() {
       return this.timeout;
   }

   public void setTimeout(int newTimeOut){
       this.timeout = newTimeOut;
   }
}