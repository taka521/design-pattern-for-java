package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * 練習問題
 * <p>
 * {@link Properties} のAdapterを作成する。
 */
public class Exercises {

    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();

        try {
            fileIO.readFormFile("input.txt");

            fileIO.setValue("year", "2017");
            fileIO.setValue("month", "12");
            fileIO.setValue("day", "31");

            fileIO.writeToFile("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


interface FileIO {

    /**
     * 指定されたファイルを読み込みます。
     *
     * @param filename ファイル名
     *
     * @throws IOException
     */
    void readFormFile(String filename) throws IOException;

    /**
     * 指定されたファイルに書き込みます。
     *
     * @param filename ファイル名
     *
     * @throws IOException
     */
    void writeToFile(String filename) throws IOException;

    /**
     * 指定された値を、キーと紐付けて設定します。
     *
     * @param key   キー
     * @param value 値
     */
    void setValue(String key, String value);

    /**
     * 指定されたキーに紐づく値を取得します。
     *
     * @param key キー
     *
     * @return キーに紐づく値
     */
    String getValue(String key);
}

/**
 * プロパティ形式で記述されたファイルの入出力を行うAdapter（Wrapper）
 */
class FileProperties implements FileIO {

    private final Properties properties = new Properties();

    @Override
    public void readFormFile(String filename) throws IOException {
        try (InputStream is = new FileInputStream(getAbsolutePath(filename))) {
            properties.load(is);
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        try (OutputStream os = new FileOutputStream(getAbsolutePath(filename))) {
            properties.store(os, "");
        }
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }

    private String getAbsolutePath(String filename) {

        String result = "";
        try {
            result = ClassLoader.getSystemResource(filename).toURI().getPath();
            System.out.println(result);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }
}