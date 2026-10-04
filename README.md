# Assignment 3 - Bridge Pattern

Name: Baikanov Daniyar
Group: SE-2527
Topic: A - Drawing  
Repository: https://github.com/Daniyaar07/Assignment3SDP.git
## Base Commit
be79da0

## Classes

| Role | Class |
|---|---|
| Abstraction | Shape |
| A1 | Circle |
| A2 | Square |
| Implementor | Renderer |
| I1 | VectorRenderer |
| I2 | RasterRenderer |
| I3 | AsciiRenderer |
| Client | Main |

## Bridge Structure

Bridge field: `Shape.java` - `protected Renderer renderer;`

execute(): `Shape.java`, implemented in `Circle.java` and `Square.java`

setImplementation(): `Shape.java`

T5 runtime switch: `Main.java`