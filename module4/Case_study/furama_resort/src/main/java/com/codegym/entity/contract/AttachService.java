package com.codegym.entity.contract;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attach_service")
public class AttachService {
    @Id
    @Column(name = "attach_service_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attachServiceId;

    @Column(name = "attach_service_name")
    private String attachServiceName;

    @Column(name = "attach_service_cost")
    private String attachServiceCost;

    @Column(name = "attach_service_unit")
    private String attachServiceUnit;

    @Column(name = "attach_service_status")
    private String attachServiceStatus;

    @OneToMany(mappedBy = "attachService", cascade = CascadeType.ALL)
    private List<ContractDetail> contractDetailList;

    public AttachService() {
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public String getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(String attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public String getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(String attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
