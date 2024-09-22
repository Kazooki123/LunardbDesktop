package com.lunardbapp.ui

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage
import javafx.geometry.Pos

class MainView : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.title = "LunarDB Manager"

        val label = Label("Hello LunarDB!").apply {
            style = "-fx-font-size: 24px; -fx-font-weight: bold;"
        }

        val button = Button("Click Me!").apply {
            style = "-fx-background-color: purple; -fx-text-fill: white;"
            setOnAction {
                println("Button clicked!")
            }
        }

        val vbox = VBox(20.0, label, button).apply {
            alignment = Pos.CENTER
        }

        val scene = Scene(vbox, 300.0, 200.0)
        primaryStage.scene = scene
        primaryStage.show()
    }
}
