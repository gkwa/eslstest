test: eslstest
	cd $< && mvn test

webdriver-java-quickstart-archetype:
	git clone git://github.com/barancev/$@.git
	cd $@ && mvn install

eslstest:
	mvn archetype:generate -DarchetypeGroupId=ru.stqa.selenium -DarchetypeArtifactId=webdriver-java-quickstart-archetype -DarchetypeVersion=0.7 -DgroupId=com.streambox.$@ -DartifactId=$@ -DinteractiveMode=false

clean:
	rm -rf eslstest/target
