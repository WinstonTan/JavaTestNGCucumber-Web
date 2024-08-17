package util;

import java.util.List;
import java.util.Map;

public class TestData {
    private static List<Map<String, String>> data;

    public static void setTestData(List<Map<String, String>> testData) {
        TestData.data = testData;
    }

    public static List<Map<String, String>> getTestData() {
        return data;
    }
}