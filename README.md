Description
-----------

A simple template and script to create java projects built with gradle.


Installation
------------

Make the script ``create-java-project`` available in your PATH. Make sure ``git`` and ``gradle`` are in your PATH as well.


Usage
-----

Type ``create-java-project [project-name]`` where [project-name] is the name you want to give to your project (no space allowed). For example, ``create-java-project hello-world``

This will:
- copy skeleton files
- substitute the string PROJECTNAME to the project name both inside files and in the name of files/folders
- run ``gradle eclipse`` to prepare the folder to be imported by eclipse


Customization
-------------

Fork this repository and change the string ``alexandrebouchard`` in ``create-java-project`` to your github user.