# British Spoken Time Converter

A Java application that converts a given time (HH:mm) into its British spoken form.  
For example:
- `12:00` → `noon`
- `00:00` → `midnight`
- `07:30` → `half past seven`
- `09:45` → `quarter to ten`

---

## 🚀 How to Run

### Prerequisites
- Java 17+
- Maven 3.8+

### Build & Run
```bash
mvn clean package
mvn exec:java -Dexec.mainClass="com.example.timeconverter.App"
