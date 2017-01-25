package com.yingu.nativeservice.contractservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LbTContractNoGenRepository  extends JpaRepository<LbTContractNoGen, Long>{
	LbTContractNoGen findByOrgId(String name);
	
}
