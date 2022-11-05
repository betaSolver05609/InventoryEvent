package com.manufacturing.scanner.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Material {
    private Integer materialId;
    private String materialName;
    private String vendor;
}
