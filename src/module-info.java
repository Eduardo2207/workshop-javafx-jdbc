module workshopjavafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	opens  model.entities;
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
}
