package br.com.monitorweb.entity;

import br.com.monitorweb.entity.generic.GenericEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Eduardo Balan on 07/07/2017.
 */
@Entity
@Table(name = "tb_monitoramento_cpu", schema = "public")
@SequenceGenerator(name = "tb_monitoramento_cpu_cpum_id_seq", sequenceName = "public.tb_monitoramento_cpu_cpum_id_seq")
public class MonitoramentoCpu extends GenericEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_monitoramento_cpu_cpum_id_seq")
    @Column(name = "cpum_id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cpui_id")
    private InformacoesCpu informacoesCpu;

    @Column(name = "cpum_core_id")
    private Long coreId;

    @Column(name = "cpum_cpu_mhz")
    private Long cpuMhz;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cpum_dthr_cadastro")
    private Date dtHrCadastro;

    public Long getId() {
        return id;
    }

    public InformacoesCpu getInformacoesCpu() {
        return informacoesCpu;
    }

    public void setInformacoesCpu(InformacoesCpu informacoesCpu) {
        this.informacoesCpu = informacoesCpu;
    }

    public Long getCoreId() {
        return coreId;
    }

    public void setCoreId(Long coreId) {
        this.coreId = coreId;
    }

    public Long getCpuMhz() {
        return cpuMhz;
    }

    public void setCpuMhz(Long cpuMhz) {
        this.cpuMhz = cpuMhz;
    }

    public Date getDtHrCadastro() {
        return dtHrCadastro;
    }

    public void setDtHrCadastro(Date dtHrCadastro) {
        this.dtHrCadastro = dtHrCadastro;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}

