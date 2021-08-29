package org.worker.design.facade;

/**
 * 外观模式
 * 提供一个统一的接口，访问子系统的一群接口
 * @author peiru wang
 * @date 2021/8/28
 */
public class FacadeDemo {
    public static void main(String[] args) {
        HospitalFacade facade = new HospitalFacade();

        facade.register();
        facade.seeDoctor();
        facade.takeMedicine();
    }
}
