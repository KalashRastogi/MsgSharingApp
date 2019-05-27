// * when we create android project it asks for application name: the name you enter will be shown
// on play store when you publish that app
// * package_name: should be reverse of  website name
// * significance: unique identity is provided by that
// * and this should not get clashed with other app's package name in playstore
// * it can be changed
// * msgShareApp: parent project name contains sub projects and its files
// * app: sub-project and also known as a module
// * com.example.msgSharingApp: this is package name and contains java and kotlin files.
// * resource(res) folder: contains UI resource visible to user image,video,etc
// * res/drawable: image and video assets
// * res/mipmap: app launcher icons
// * res/values: app styles and themes color details and localized strings(text used in app UI)
// * layout files are stored in layout folder
// * AndroidManifest.xml :
// * contains application components details
// * declarations of activity, service, broadcastReciever and contentProvider
// * define necessary permissions: uses internet, uses camera, read sd card and so on
// * it is like summary of application
// * build.gradle :
// * builds configuration
// * plugins to be used
// * external libraries or dependencies to be included
// * project->app->we can have multiple app in a single project
// * project->app->src->main->java-basically in this main activity program is stored all the logic
// * part is stored here
// * project->app->src->main->resource(res)- and all the grphics & UI part is stored here
// * gradle.build and xml files are automatically generated so don't worry about them
// * main activity-entry point for application
// * when the activity get created onCreate function will run
// * setContentView will render activity_main xml and that how a android screen looks
// * four building blocks of android:
// * activity, broadcast reciever, service and content provider:
// * (All of these must be declared in AndroidManifest.xml)
// * Activity: an activity represents a single screen with a UI aka layout
// * e.g. MainActivity.kt had a attached Layout (UI) of activity_main.xml
// * activity: kotlin file and layout: xml file
// * view: smaller entities of layout are views e.g. TextView, CheckBox, Button, ListView, ImageView,etc
// *
// *
package com.example.msgsharingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){      /*this is class which represent on screen*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            //code
            Log.i("MainActivity", "Button was clicked")
            /*log statements help developers that every thing working fine or not*/
            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()

        }
    }
}