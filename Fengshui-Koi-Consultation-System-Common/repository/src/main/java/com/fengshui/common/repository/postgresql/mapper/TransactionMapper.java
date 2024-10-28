package com.fengshui.common.repository.postgresql.mapper;

import com.fengshui.common.repository.postgresql.IAppUserRepository;
import com.fengshui.common.repository.postgresql.dto.TransactionDTO;
import com.fengshui.common.repository.postgresql.entities.AppUser;
import com.fengshui.common.repository.postgresql.entities.AppUserEntity;
import com.fengshui.common.repository.postgresql.entities.TransactionEntity;

import java.time.LocalDateTime;

public class TransactionMapper {
    private final IAppUserRepository appUserRepository;
    public TransactionMapper(IAppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    public static TransactionDTO toDTO(TransactionEntity entity){
        if (entity == null) {return null;
    }
    return TransactionDTO.builder()
            .id(entity.getId())
            .createdAt(LocalDateTime.parse(entity.getCreatedAt().toString()))
            .appUser(entity.getAppUser().getId())
            .adsPackage(entity.getAdsPackage())
            .price(entity.getPrice())
            .build();
}


public static TransactionEntity toEntity(TransactionDTO dto, IAppUserRepository appUserRepository) {
    if (dto == null) {
        return null;
    }
    AppUserEntity getAppUser = appUserRepository.findById(dto.getAppUser())
            .orElseThrow(() -> new RuntimeException("User not found"));

    return TransactionEntity.builder()
            .Id(dto.getId())
            .createdAt(dto.getCreatedAt())
            .appUser(getAppUser)
            .adsPackage(dto.getAdsPackage())
            .price(dto.getPrice())
            .build();
    }
}
