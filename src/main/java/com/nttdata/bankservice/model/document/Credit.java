package com.nttdata.bankservice.model.document;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.bankservice.model.document.type.CreditTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "credits")
public class Credit {
	
	@Id
	private String id;
	
	private String number;

	private CreditTypeEnum creditType;
	
	private String clientId;
	
	private Double loan;
	
	private Double loanInterest;
	
	private Double contableBalance;
	
	private CreditCard credicard;
	
	private List<CreditPayment> payments;
		
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String updatedBy;
	
}