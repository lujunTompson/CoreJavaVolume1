# CoreJavaVolume1

- I want to record all the code and notes I wrote while learning Core Jave Volume I.

- You can download and see my code comments. 

- Writing the code line by line will improve your Java coding skill a lot!

- Good luck!

  

### 1.如何保证compareTo方法在子类中实现符合对称性的原则呢？

**法1**：如果不同子类中的比较有不同的含义，就要在方法中将不同类的比较视为非法，在每个compareTo方法的开始位置进行以下检测：

if (getClass() != other.getClass())  throw new ClassCastException();

**法2**：如果存在比较子类对象的通用算法，可以在超类中提供一个compareTo方法，声明为final。

如只想根据职位高低比较，可为Employee和每个子类定义rank方法，在Employee类中实现一个考虑rank值的compareTo方法。

### 2.比较有用的两个函数式接口

- 接口Predicate

```java
public interface Predicate<T>
{
    boolean test(T t);
}

list.removeIf(e -> e == null);
//Objects类有一个方法用于测试一个对象引用是否为null
list.removeIf(Objects::isNull);
```

- 接口Supplier

```java
public interface Supplier<T>
{
    T get();
}
```

供应者没有参数，用于实现懒计算，只在需要值时才调用供应者，如：

```java
LocalDate hireDay = Objects.requireNonNullOrElseGet(day, () -> new LocalDate(1970, 1, 1));
```

### 3.lambda表达式写为方法引用

前提：只有当lambda表达式的体只调用一个方法而不做其他操作时，才能把lambda表达式重写为方法引用。

### 4.其他有关lambda表达式的注意点

如果一个接口只有一个抽象方法，可以用@FunctionalInterface注解来标记这个接口。

