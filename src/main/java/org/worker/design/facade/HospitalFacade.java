package org.worker.design.facade;

/**
 * 外观（门面）
 * 提供给客户端访问，隐匿子系统的复杂性
 * @author peiru wang
 * @date 2021/8/28
 */
public class HospitalFacade {

    private RegisterSubSys registerSubSys;
    private OutpatientSubSys outpatientSubSys;
    private MedicineSubSys medicineSubSys;

    public HospitalFacade() {
        this.registerSubSys = new RegisterSubSys();
        this.outpatientSubSys = new OutpatientSubSys();
        this.medicineSubSys = new MedicineSubSys();
    }


    public void register() {
        registerSubSys.register();
    }

    public void seeDoctor() {
        outpatientSubSys.seeADoctor();
    }

    public void takeMedicine() {
        medicineSubSys.takeMedicine();
    }
}
