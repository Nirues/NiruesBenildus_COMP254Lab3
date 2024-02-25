import java.io.File;

public class Exercise3 {

    public static void find(String path, String filename) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File file : list) {
            if (file.isDirectory()) {
                find(file.getAbsolutePath(), filename);
            } else {
                if (file.getName().equals(filename)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args) {

        String path = "C:\\Users\\nirue\\IdeaProjects\\NiruesBenildus_COMP254Lab3\\src";

        String filename = "Exercise2.java";

        find(path, filename);
    }
}

