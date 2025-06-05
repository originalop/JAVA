# Java Program: Get User Input Using `BufferedReader`

This Java program demonstrates how to collect various types of user input using the `BufferedReader` class from the `java.io` package. It prompts the user for their name, sex, age, and weight, then displays the collected information.

## 📄 Code Explanation

```java
import java.io.*;
```
- Imports all the classes from the `java.io` package, including `BufferedReader`, `InputStreamReader`, and exception handling classes.

### Class Declaration

```java
class GetInput
```
- Defines the main class `GetInput`.

### Main Method

```java
public static void main(String args[]) throws IOException
```
- Entry point of the Java application.
- `throws IOException` is required to handle input/output exceptions that may occur during `readLine()` operations.

### Input Stream Setup

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```
- `InputStreamReader(System.in)` converts bytes from the console to characters.
- `BufferedReader` reads text efficiently from the character input stream.

---

## 🔡 Input: Name

```java
System.out.print("Enter your name: ");
String name = br.readLine();
```
- Prompts the user to enter their name.
- `readLine()` captures the entire line of input as a `String`.

---

## ⚥ Input: Sex (Character)

```java
System.out.print("Enter your sex: ");
char sex = br.readLine().charAt(0);
```
- Prompts the user to enter their sex (e.g., `M` or `F`).
- `readLine()` reads the entire line as a `String`.
- `charAt(0)` extracts the first character only.
- Note: Even if the user presses Enter (`\n`), `charAt(0)` ignores it and picks the first visible character.

---

## 🔢 Input: Age (Integer)

```java
System.out.print("Enter your age: ");
String tempAge = br.readLine();
int age = Integer.parseInt(tempAge);
```
- Prompts the user to enter their age.
- Converts the input `String` into an `int` using `Integer.parseInt()`.

---

## ⚖️ Input: Weight (Float)

```java
System.out.print("Enter your weight: ");
String tempWeight = br.readLine();
float weight = Float.parseFloat(tempWeight);
```
- Prompts the user to enter their weight.
- Converts the input `String` into a `float` using `Float.parseFloat()`.

---

## 🖨️ Output Section

```java
System.out.println("Your name is: " + name);
System.out.println("Your age is: " + age);
System.out.println("Your sex is: " + sex);
System.out.println("Your weight is: " + weight);
```
- Displays the collected user input back to the console.

---

## ✅ Sample Output

```
Enter your name: Alice
Enter your sex: F
Enter your age: 25
Enter your weight: 60.5
Your name is: Alice
Your age is: 25
Your sex is: F
Your weight is: 60.5
```

---

## 📌 Notes

- Using `BufferedReader` requires careful handling of input conversion.
- For character inputs, use `charAt(0)` to safely extract the first character.
- Always parse `String` inputs to `int` or `float` as needed using `Integer.parseInt()` or `Float.parseFloat()`.
- `BufferedReader` is efficient for reading lines but requires exception handling and manual type parsing.

---

## 🆚 Alternative: Using `Scanner` (Simpler)

```java
import java.util.Scanner;
class GetInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your sex: ");
        char sex = sc.next().charAt(0);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight: ");
        float weight = sc.nextFloat();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your sex is: " + sex);
        System.out.println("Your weight is: " + weight);
        sc.close();
    }
}
```

---

## 🧠 Summary

| Input Type | Method Used           | Conversion Required |
|------------|-----------------------|----------------------|
| String     | `readLine()`          | No                   |
| Character  | `readLine().charAt(0)`| Yes (manual extract) |
| Integer    | `readLine()` → `int`  | `Integer.parseInt()` |
| Float      | `readLine()` → `float`| `Float.parseFloat()` |

This program is a great example of handling various types of user input with careful type conversion and user-friendly prompts.