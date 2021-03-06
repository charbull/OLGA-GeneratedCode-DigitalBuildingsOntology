package www.google.com.digitalbuildings._0_0_1.states;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Matches 
* Two or more things match.
*/
@SuppressWarnings("serial")
public class Matches extends www.google.com.digitalbuildings._0_0_1.states.State implements IMatches{

	IRI newInstance;
	public Matches(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/states#Matches"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IMatches> getAllMatchessObjectsCreated(){
		Set<IMatches> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/states#Matches")).subjects().stream()
		.map(mapper->(IMatches)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}