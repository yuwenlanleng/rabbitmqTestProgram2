package com.gomefinance;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/1.
 */
public class VO {
    /*{"dataInfo":{"" +
           // "plannedTermInterest":0.00,
          //  "paymentStatus":"1",
           // "phaseNumber":1,
            //"presentId":"510001",
            //"indeedTotalAmount":0.00,
            //"orgCode":"01050000",
           // "contractNo":"20160909016601000128",
            "indeedPenalty":0.00,"" +
           // "indeedPlannedTermInterest":0.00,"" +
           // "indeedTotalRemainingPrincipal":0.00,"" +
           // "prepaymentDate":"2016-09-11",
           // "penalty":0.00,
           // "totalRemainingPrincipal":0.00},
        "msgInfo":"AllRepay"}*/
    private String contractNo ="MFNB110105198606060075041";
    private String orgCode="0001";
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date prepaymentDate = new Date();
    private BigDecimal plannedTermInterest =new BigDecimal(0.00);
    private BigDecimal totalRemainingPrincipal=new BigDecimal(8000.00);
    private BigDecimal penalty=new BigDecimal(0.00);
    private BigDecimal totalAmount=new BigDecimal(8000);
    private Short paymentStatus=1;
    private Integer phaseNumber=2;
    private BigDecimal indeedTotalAmount=new BigDecimal(8000.00);
    private BigDecimal indeedTotalRemainingPrincipal=new BigDecimal(8000);
    private BigDecimal indeedPlannedTermInterest=new BigDecimal(0.00);
    private BigDecimal indeedPenalty=new BigDecimal(0.00);
    private Long presentId=492L;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getPrepaymentDate() throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.parse("2025-10-2");
    }

    public void setPrepaymentDate(Date prepaymentDate) {
        this.prepaymentDate = prepaymentDate;
    }

    public BigDecimal getPlannedTermInterest() {
        return plannedTermInterest;
    }

    public void setPlannedTermInterest(BigDecimal plannedTermInterest) {
        this.plannedTermInterest = plannedTermInterest;
    }

    public BigDecimal getTotalRemainingPrincipal() {
        return totalRemainingPrincipal;
    }

    public void setTotalRemainingPrincipal(BigDecimal totalRemainingPrincipal) {
        this.totalRemainingPrincipal = totalRemainingPrincipal;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Short getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Short paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getPhaseNumber() {
        return phaseNumber;
    }

    public void setPhaseNumber(Integer phaseNumber) {
        this.phaseNumber = phaseNumber;
    }

    public BigDecimal getIndeedTotalAmount() {
        return indeedTotalAmount;
    }

    public void setIndeedTotalAmount(BigDecimal indeedTotalAmount) {
        this.indeedTotalAmount = indeedTotalAmount;
    }

    public BigDecimal getIndeedTotalRemainingPrincipal() {
        return indeedTotalRemainingPrincipal;
    }

    public void setIndeedTotalRemainingPrincipal(BigDecimal indeedTotalRemainingPrincipal) {
        this.indeedTotalRemainingPrincipal = indeedTotalRemainingPrincipal;
    }

    public BigDecimal getIndeedPlannedTermInterest() {
        return indeedPlannedTermInterest;
    }

    public void setIndeedPlannedTermInterest(BigDecimal indeedPlannedTermInterest) {
        this.indeedPlannedTermInterest = indeedPlannedTermInterest;
    }

    public BigDecimal getIndeedPenalty() {
        return indeedPenalty;
    }

    public void setIndeedPenalty(BigDecimal indeedPenalty) {
        this.indeedPenalty = indeedPenalty;
    }

    public Long getPresentId() {
        return presentId;
    }

    public void setPresentId(Long presentId) {
        this.presentId = presentId;
    }
    public static void main(String[] args){
      /*  BigDecimal  a = new BigDecimal(0.01);
     //    BigDecimal b = new BigDecimal(0.0200);
        BigDecimal bigDecimal = a.setScale(4, BigDecimal.ROUND_HALF_UP);
        //  BigDecimal add = a.add(new BigDecimal(0.01));
        //  BigDecimal add = b.add(new BigDecimal(0.0000));*/
       // System.out.println(bigDecimal);

        BigDecimal divide = new BigDecimal(0.072).setScale(4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
        System.out.println(divide);
        //
        Long time = new Long("1758265738000");

    }
}
