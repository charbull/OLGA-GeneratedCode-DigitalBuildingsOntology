package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Return 
* Measurement or process of media as it is returned from the end-use equipment within the system.
*/
@SuppressWarnings("serial")
public class Return extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IReturn{

	IRI newInstance;
	public Return(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Return"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IReturn> getAllReturnsObjectsCreated(){
		Set<IReturn> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Return")).subjects().stream()
		.map(mapper->(IReturn)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}