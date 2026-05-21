public class SimpleProcessor {
    // Generic method restricted to only Integer or String
    public static <T> void process(T a, T b) {
        if (a instanceof Integer && b instanceof Integer) {
            int result = (Integer) a * (Integer) b;
            System.out.println("Multiplication result: " + result);
        } else if (a instanceof String && b instanceof String) {
            String result = (String) a + (String) b;
            System.out.println("Merged string: " + result);
        } else {
            System.out.println("Only Integer or String types aresupported, and both inputs must be of the same type.");
        }
    }

    public static void main(String[] args) {
// Integer multiplication
        process(4, 5); // Output: Multiplication result: 20
// String merging
        process("Hello ", "World"); // Output: Merged string: HelloWorld
// Mismatched types (e.g., String + Integer)
        process("Test", 10); // Output: Only Integer or Stringtypesare supported... }
    }
}