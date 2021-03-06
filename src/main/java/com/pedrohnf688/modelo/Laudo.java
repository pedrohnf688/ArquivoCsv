/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedrohnf688.modelo;

/**
 *
 * @author phnf2
 */
public class Laudo {
    
    private String batchId;
    private String sequence;
    private String date;
    private String sampleid;
    private float fat;
    private float trupro;
    private float totpro;
    private float casein;
    private float solids;
    private float snf;
    private float fpd;
    private float urea;

    public Laudo() {
    }

//    public Laudo(String batchId, String sequence, String date, String sampleid, float fat, float trupro, float totpro, float casein, float solids, float snf, float fpd, float urea) {
//        this.batchId = batchId;
//        this.sequence = sequence;
//        this.date = date;
//        this.sampleid = sampleid;
//        this.fat = fat;
//        this.trupro = trupro;
//        this.totpro = totpro;
//        this.casein = casein;
//        this.solids = solids;
//        this.snf = snf;
//        this.fpd = fpd;
//        this.urea = urea;
//    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSampleid() {
        return sampleid;
    }

    public void setSampleid(String sampleid) {
        this.sampleid = sampleid;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getTrupro() {
        return trupro;
    }

    public void setTrupro(float trupro) {
        this.trupro = trupro;
    }

    public float getTotpro() {
        return totpro;
    }

    public void setTotpro(float totpro) {
        this.totpro = totpro;
    }

    public float getCasein() {
        return casein;
    }

    public void setCasein(float casein) {
        this.casein = casein;
    }

    public float getSolids() {
        return solids;
    }

    public void setSolids(float solids) {
        this.solids = solids;
    }

    public float getSnf() {
        return snf;
    }

    public void setSnf(float snf) {
        this.snf = snf;
    }

    public float getFpd() {
        return fpd;
    }

    public void setFpd(float fpd) {
        this.fpd = fpd;
    }

    public float getUrea() {
        return urea;
    }

    public void setUrea(float urea) {
        this.urea = urea;
    }

    @Override
    public String toString() {
        return "Laudo{" + "batchId=" + batchId + ", sequence=" + sequence + ", date=" + date + ", sampleid=" + sampleid + ", fat=" + fat + ", trupro=" + trupro + ", totpro=" + totpro + ", casein=" + casein + ", solids=" + solids + ", snf=" + snf + ", fpd=" + fpd + ", urea=" + urea + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
