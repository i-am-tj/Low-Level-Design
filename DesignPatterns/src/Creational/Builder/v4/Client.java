package Creational.Builder.v4;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws Exception {
        // In this version, we are using Map to pass to constructor.
        Map<String, Object> studs = new HashMap<>();
        studs.put("name", "Tanuj");
        studs.put("age", 26);
        studs.put("psp", 89.6);

        Student s = new Student(studs);

        // Problems with this approach -
        // 1. If there is a small typo in key. Suppose, instead of "name" they provide "nme". Then the value won't be found. --> This is a debugging issue.
        // 2. Suppose another client puts a different datatype in the value of the map
        // Then, also we won't get any compile type error as we have created a Map of String, Object.
        // This issue won't get detected in compile time.
        // And a good codebase should be able to detect as many issues as possible at compile time rather than run time.

        // Now again we need something that should allow multiple values and each value should have a name
        // Also default value / empty if something is not passed. Also, each value should have a name that is fixed.
        // So typos should not be allowed and only fixed set of keys can be implemented.
        // And datatype of each key must be specific.

        // So, which DS can actually take care of all of this above-mentioned criteria?
        // Exactly, a class
        // So let's implement this in v5

    }
}
