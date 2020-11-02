package org.worker.singleton.seriable;

import java.io.*;

public class HungrySingletoTest {
    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        System.out.println(instance1 == instance2);

        try {
            OutputStream fos = new FileOutputStream("HungrySingletoObject.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance1);
            oos.flush();
            oos.close();
            fos.close();

            InputStream fis = new FileInputStream("HungrySingletoObject.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HungrySingleton obj = (HungrySingleton) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(obj == instance2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
