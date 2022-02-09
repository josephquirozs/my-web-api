package com.example.webapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class CPE {
    private Long idConsultaCpe;
    private Long idTipoDocumento;
    private String ruc;
    private String razonSocial;
    private String serie;
    private String correlativo;
    private LocalDateTime fechaEmision;
    private Object xmlEnvio;
    private Object xmlRespuesta;
    private Object pdfDocumento;
    private String nombreArchivoEnvio;
    private String nombreArchivoRespuesta;
    private Double monto;
    private Boolean estadoRegistro;
    private String tipoDocumento;
    private String codTipoDocumento;

    public CPE(Long idConsultaCpe, Long idTipoDocumento, String ruc, String razonSocial, String serie, String correlativo, LocalDateTime fechaEmision, Object xmlEnvio, Object xmlRespuesta, Object pdfDocumento, String nombreArchivoEnvio, String nombreArchivoRespuesta, Double monto, Boolean estadoRegistro, String tipoDocumento, String codTipoDocumento) {
        this.idConsultaCpe = idConsultaCpe;
        this.idTipoDocumento = idTipoDocumento;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.serie = serie;
        this.correlativo = correlativo;
        this.fechaEmision = fechaEmision;
        this.xmlEnvio = xmlEnvio;
        this.xmlRespuesta = xmlRespuesta;
        this.pdfDocumento = pdfDocumento;
        this.nombreArchivoEnvio = nombreArchivoEnvio;
        this.nombreArchivoRespuesta = nombreArchivoRespuesta;
        this.monto = monto;
        this.estadoRegistro = estadoRegistro;
        this.tipoDocumento = tipoDocumento;
        this.codTipoDocumento = codTipoDocumento;
    }

    @JsonProperty("idConsultaCpe")
    public Long getIDConsultaCpe() {
        return idConsultaCpe;
    }

    @JsonProperty("idConsultaCpe")
    public void setIDConsultaCpe(Long value) {
        this.idConsultaCpe = value;
    }

    @JsonProperty("idTipoDocumento")
    public Long getIDTipoDocumento() {
        return idTipoDocumento;
    }

    @JsonProperty("idTipoDocumento")
    public void setIDTipoDocumento(Long value) {
        this.idTipoDocumento = value;
    }

    @JsonProperty("ruc")
    public String getRuc() {
        return ruc;
    }

    @JsonProperty("ruc")
    public void setRuc(String value) {
        this.ruc = value;
    }

    @JsonProperty("razonSocial")
    public String getRazonSocial() {
        return razonSocial;
    }

    @JsonProperty("razonSocial")
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    @JsonProperty("serie")
    public String getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(String value) {
        this.serie = value;
    }

    @JsonProperty("correlativo")
    public String getCorrelativo() {
        return correlativo;
    }

    @JsonProperty("correlativo")
    public void setCorrelativo(String value) {
        this.correlativo = value;
    }

    @JsonProperty("fechaEmision")
    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    @JsonProperty("fechaEmision")
    public void setFechaEmision(LocalDateTime value) {
        this.fechaEmision = value;
    }

    @JsonProperty("xmlEnvio")
    public Object getXMLEnvio() {
        return xmlEnvio;
    }

    @JsonProperty("xmlEnvio")
    public void setXMLEnvio(Object value) {
        this.xmlEnvio = value;
    }

    @JsonProperty("xmlRespuesta")
    public Object getXMLRespuesta() {
        return xmlRespuesta;
    }

    @JsonProperty("xmlRespuesta")
    public void setXMLRespuesta(Object value) {
        this.xmlRespuesta = value;
    }

    @JsonProperty("pdfDocumento")
    public Object getPDFDocumento() {
        return pdfDocumento;
    }

    @JsonProperty("pdfDocumento")
    public void setPDFDocumento(Object value) {
        this.pdfDocumento = value;
    }

    @JsonProperty("nombreArchivoEnvio")
    public String getNombreArchivoEnvio() {
        return nombreArchivoEnvio;
    }

    @JsonProperty("nombreArchivoEnvio")
    public void setNombreArchivoEnvio(String value) {
        this.nombreArchivoEnvio = value;
    }

    @JsonProperty("nombreArchivoRespuesta")
    public String getNombreArchivoRespuesta() {
        return nombreArchivoRespuesta;
    }

    @JsonProperty("nombreArchivoRespuesta")
    public void setNombreArchivoRespuesta(String value) {
        this.nombreArchivoRespuesta = value;
    }

    @JsonProperty("monto")
    public Double getMonto() {
        return monto;
    }

    @JsonProperty("monto")
    public void setMonto(Double value) {
        this.monto = value;
    }

    @JsonProperty("estadoRegistro")
    public Boolean getEstadoRegistro() {
        return estadoRegistro;
    }

    @JsonProperty("estadoRegistro")
    public void setEstadoRegistro(Boolean value) {
        this.estadoRegistro = value;
    }

    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @JsonProperty("tipoDocumento")
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    @JsonProperty("codTipoDocumento")
    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    @JsonProperty("codTipoDocumento")
    public void setCodTipoDocumento(String value) {
        this.codTipoDocumento = value;
    }
}

