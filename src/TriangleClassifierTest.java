import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void testTamGiacDeu() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = "La tam giac deu";
        String actual = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTamGiacCan() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = "la tam giac can";
        String actual = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTamGiacVuongCan() {
        double a = 3;
        double b = 3;
        double c = Math.sqrt(18);
        String expected = "la tam giac vuong can";
        String actual = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void testTamGiacVuong() {
        double a = 3;
        double b = 4;
        double c = 5;
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        String khaoKhat = "la tam giac vuong";
        assertEquals(result, khaoKhat);
    }

    @Test
    void testTamGiacThuong() {
        double a = 5;
        double b = 4;
        double c = 6;
        String expected = "la tam giac thuong";
        String actual = TriangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, actual);
    }
}