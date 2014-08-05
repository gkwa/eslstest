no name
=======

The key here is that we do the mvn install step because the module we
install is referenced later from the .m2 catalog.

```sh
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

crhome driver
=============

https://code.google.com/p/selenium/wiki/ChromeDriver
https://sites.google.com/a/chromium.org/chromedriver/home
https://sites.google.com/a/chromium.org/chromedriver/getting-started
http://chromedriver.storage.googleapis.com/2.10/chromedriver_mac32.zip

mac chromedriver
----------------
```sh
wget --timestamping http://chromedriver.storage.googleapis.com/2.10/chromedriver_mac32.zip
7z x -y chromedriver_mac32.zip
mkdir -p /usr/local/stow/chromedriver/2.10
cp chromedriver /usr/local/stow/chromedriver/2.10
stow --target=/usr/local/bin --dir=/usr/local/stow/chromedriver 2.10
chmod a+x /usr/local/stow/chromedriver/2.10/chromedriver /usr/local/bin/chromedriver
ls -la /usr/local/bin/chromedriver
````

windows chromedriver
--------------------
http://stackoverflow.com/questions/16630111/launch-chrome-browser

```sh
wget --timestamping http://chromedriver.storage.googleapis.com/2.10/chromedriver_win32.zip
7z x -y chromedriver_win32.zip
mkdir -p /usr/local/stow/chromedriver/2.10
cp chromedriver.exe /usr/local/stow/chromedriver/2.10
stow --target=/usr/local/bin --dir=/usr/local/stow/chromedriver 2.10
chmod a+x /usr/local/stow/chromedriver/2.10/chromedriver.exe /usr/local/bin/chromedriver
ls -la /usr/local/bin/chromedriver
wget --timestamping http://dl.dropbox.com/u/9140609/sb/ephemeral/pathman.exe
pathman /au 'c:\cygwin64\usr\local\stow\chromedriver\2.10'
```

when <browser.name> is not set in pom.xml, then you're using HtmlUnitDriver
===========================================================================

https://code.google.com/p/selenium/wiki/HtmlUnitDriver

no name
=======

This page[1] says my chrome.exe should be here:
C:\Users\%USERNAME%\AppData\Local\Google\Chrome\Application\chrome.exe

but its here on windows 2k12:
C:\Program Files (x86)\Google\Chrome\Application\chrome.exe

after having installed it with chocolatey (cmd /c cinst GoogleChrome)

So there is a way to override binary path:
https://code.google.com/p/selenium/wiki/ChromeDriver#Overriding_the_Chrome_binary_location

[1]: https://code.google.com/p/selenium/wiki/ChromeDriver
