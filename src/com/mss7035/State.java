package Testing;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface State {
    public static void save(Object object, String directory) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(directory + ".dat"));
            oos.writeObject(object);
        } catch(IOException e) {
            System.out.println("Something broke.");
            e.printStackTrace();
            System.exit(1);
        } finally {
            try {
                if(oos != null) {
                    oos.close();
                }
            } catch(IOException e) {
                System.out.println("Something broke.");
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
    public static Object load(String directory) {
        ObjectInputStream ois = null;
        Object object = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(directory + ".dat"));
            object = (Object) ois.readObject();
        } catch(IOException e) {
            System.out.println("Something broke.");
            e.printStackTrace();
            System.exit(1);
        } catch(ClassNotFoundException e) {
            System.out.println("Something broke.");
            e.printStackTrace();
            System.exit(1);
        }finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch(IOException e) {
                System.out.println("Something broke.");
                e.printStackTrace();
                System.exit(1);
            }
        }
        return object;
    }
}