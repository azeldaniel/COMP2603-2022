# Responses

## Part 1

### 4

This is an example of method refinement as we use the parent's toString method and add the word "Rectangle" to it.

### 5

The output remained the same. The toString() method of the Rectangle class was invoked on the s2 variable even though its static type is SimpleShape. This is because the more specific, child method will always be invoked at runtime on polymorphic variables.

### 9

The following table summarises the toString methods that are invoked on each object.

| Object | toString() Class |
| ------ | ---------------- |
| s1     | SimpleShape      |
| s2     | Rectangle        |
| s3     | Circle           |
| s4     | Circle           |
| s5     | Rectangle        |

### 10

The following table summarises the static and dynamic types for each object.

| Object | Static      | Dynamic     |
| ------ | ----------- | ----------- |
| s1     | SimpleShape | SimpleShape |
| s2     | SimpleShape | Rectangle   |
| s3     | SimpleShape | Circle      |
| s4     | Circle      | Circle      |
| s5     | Rectangle   | Rectangle   |

### 11

#### b)

Yes it worked. This is because all of the objects are either of type SimpleShape or one of its children classes. This means that each of the objects can be placed into statically typed SimpleShape array. They will just be polymorphic variables at that point.

#### c)

Yes it worked. The static type of the variables in the array is SimpleShape, but locations 1-4 will contain polymorphic variables that are of type Rectangle or Circle. This is evidenced when we invoke their toString() methods; as the child specific toString() methods would be invoked on those polymorphic variables.

### 13

Object s1's area will not be updated because there is no functionality in the SimpleShape class's calculateArea() method. Thus, nothing is done when invoked on a dynamically typed SimpleShape objects. The area of a shape depends on its dynamic type: if it is a circle -> pi x r x r, and if it is a rectangle-> l \* b.

### 14

This will not compile as we cannot have a variable with a static type of a child class and a dynamic type of a parent class. More specifically, this is not allowed because instances of a parent class will not have all of the functionality and state that instances of child classes may have.

## Part 2

### 1

No shapes are displayed because each object currently returns null from their draw methods.

### 2

We overide the draw() method in Circle to return an Ellipse2D object as a java.awt.Shape.

### 4

We overide the draw() method in Rectangle to return an RoundRectanlge2D object as a java.awt.Shape.

### 7

We can modify our code to use the instanceof keyword to determine the dynamic type of each statically typed SimpleShape object. If we have an object with a dynamic type of Rectangle, we can change its color to red.

### 8

We cannot just cast to rectangle because the shapes array contains oher types of object such as SimpleShape and Circle. If we attempt to cast any of these to a rectangle, we will end up with a runtime error (ClassCastException). We must first verify that we are dealing with a Rectangle object by using the instanceof keyword.

### 11

The roundEdge() method words on object s5 but not s2. This is because s2 is statically typed as a SimpleShape oject, therefore the compiler will only allow us to do SimpeShape things (i.e. not Rectangle specific things like roundEdge()). In order to access the roundEdge() method at compile time, we must cast s2 to a Rectangle variable.

### 12

We can cast dynamically typed ss object to Rectangles and access the roundEdge() methods on those casted objects.
