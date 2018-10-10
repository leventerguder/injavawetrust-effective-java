package chapter05.item33.examples;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class FavoritesV3 {

	// The argument, annotationType, is a bounded type token representing an
	// annotation type. The method returns the element’s annotation of that type, if
	// it has one, or null, if it doesn’t.

	// In essence, an annotated element is a typesafe heterogeneous container whose
	// keys are annotation types.
	public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
		return null;
	}

	static Class<? extends Annotation> getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType = null; // Unbounded type token
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
		return annotationType.asSubclass(Annotation.class);

	}

}
