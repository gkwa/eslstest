* 

The key here is that we do the mvn install step because the module we
install is referenced later from the .m2 catalog.

```sh
export JAVA_HOME=$(/usr/libexec/java_home) &&
artifactid=eslstest &&
cd &&
d=$(date +%m%d%H%M) &&
rm -rf /tmp/scratch_$d &&
mkdir /tmp/scratch_$d &&
cd /tmp/scratch_$d &&
git clone git://github.com/barancev/webdriver-java-quickstart-archetype.git &&
cd webdriver-java-quickstart-archetype &&
mvn install &&
cd .. &&
mvn archetype:generate -DarchetypeGroupId=ru.stqa.selenium -DarchetypeArtifactId=webdriver-java-quickstart-archetype -DarchetypeVersion=0.7 -DgroupId=com.streambox.$artifactid -DartifactId=$artifactid -DinteractiveMode=false &&
cd $artifactid &&
mvn test
```

* windows

http://chromedriver.storage.googleapis.com/2.10/chromedriver_win32.zip

http://stackoverflow.com/questions/16630111/launch-chrome-browser

 to your java command line options: -Dwebdriver.chrome.driver='/path/to/driver'
