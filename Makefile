archtypeid=eslstest
archetypeArtifactId=webdriver-java-quickstart-archetype

OS=$(shell uname -s)
MVN=mvn
ifeq ($(OS),Darwin)
MVN:=JAVA_HOME=$(shell /usr/libexec/java_home) mvn
endif

test: $(archtypeid)
	cd $< && $(MVN) test

$(archtypeid): $(archetypeArtifactId)
	$(MVN) archetype:generate -DarchetypeGroupId=ru.stqa.selenium -DarchetypeArtifactId=$(archetypeArtifactId) -DarchetypeVersion=0.7 -DgroupId=com.streambox.$@ -DartifactId=$@ -DinteractiveMode=false

$(archetypeArtifactId):
	git clone git://github.com/barancev/$@.git
	cd $@ && $(MVN) install

clean:
	rm -rf $(archtypeid)/target
