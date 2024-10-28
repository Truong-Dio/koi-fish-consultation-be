 package com.fengshui.common.repository.postgresql.entities;
 import jakarta.persistence.*;
 import lombok.*;

 import java.time.LocalDateTime;
 import java.util.UUID;
 @Getter
 @Setter
 @NoArgsConstructor
 @AllArgsConstructor
 @Builder
 @Entity
 @Table(name = "transaction")
 public class TransactionEntity {
     @jakarta.persistence.Id
     @GeneratedValue(strategy = GenerationType.UUID)
     @Column(name = "transaction_id")
     private UUID Id;

     @Column(name = "created_at", nullable = false, updatable = false)
     private LocalDateTime createdAt;

     @OneToOne
     @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
     private AppUserEntity UserId;

     @Column(name = "ads_package")
     private String adsPackage;

     @Column(name = "price")
     private double price;

     @Column(name = "deleted", nullable = false)
     private boolean deleted;
 }