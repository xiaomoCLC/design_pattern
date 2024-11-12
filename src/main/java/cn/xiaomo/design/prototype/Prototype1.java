package cn.xiaomo.design.prototype;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaomo
 * @date 2024-10-22
 * @description TODO
 */
@Data
public class Prototype1 {

    private String name;
    private List<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Prototype1 prototype1 = new Prototype1();
        prototype1.setName("original object");
        prototype1.setValue("original object");

        Prototype1 clonePrototype1 = prototype1.clone();
        clonePrototype1.setName("clone object");
        /** 发现添加了执行了clone对象的setValue之后，也修改了prototype1中的arrayList中数据 */
        clonePrototype1.setValue("clone object");
        System.out.println("prototype1=" + prototype1);
        System.out.println("clonePrototype1=" + clonePrototype1);
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public List<String> getValue() {
        return this.arrayList;
    }

    /**
     * 浅拷贝
     * @return
     */
    @Override
    protected Prototype1 clone() {
        try {
            return (Prototype1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深拷贝
     * @return
     */
//    @Override
//    protected Prototype1 clone() {
//        Prototype1 prototype1 = null;
//        try {
//            prototype1 = (Prototype1) super.clone();
//            prototype1.setArrayList(new ArrayList<>(prototype1.getArrayList()));
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return prototype1;
//    }
}
