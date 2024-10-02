module ihu.students.spacecars {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires com.oracle.database.jdbc;
    requires org.postgresql.jdbc;

    opens ihu.students.spacecars to javafx.fxml;
    exports ihu.students.spacecars;
    exports ihu.students.spacecars.Controllers;
    opens ihu.students.spacecars.Controllers to javafx.fxml;
}