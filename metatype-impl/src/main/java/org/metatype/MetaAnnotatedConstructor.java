/*
 * Copyright 2011 David Blevins
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.metatype;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * @author David Blevins
 */
public class MetaAnnotatedConstructor<T> extends MetaAnnotatedObject<Constructor<T>> implements AnnotatedMethod<Constructor<T>> {

    private Annotation[][] parameterAnnotations;

    public MetaAnnotatedConstructor(Constructor<T> target) {
        super(target, unroll(target));
        this.parameterAnnotations = unrollParameters(target.getParameterAnnotations());
    }

    public Annotation[] getDeclaredAnnotations() {
        return get().getDeclaredAnnotations();
    }

    public Annotation[][] getParameterAnnotations() {
        return parameterAnnotations;
    }

    public Class<?> getDeclaringClass() {
        return get().getDeclaringClass();
    }

    public String getName() {
        return get().getName();
    }

    public int getModifiers() {
        return get().getModifiers();
    }

    public Class<?>[] getParameterTypes() {
        return get().getParameterTypes();
    }

    public java.lang.reflect.Type[] getGenericParameterTypes() {
        return get().getGenericParameterTypes();
    }

    public Class<?>[] getExceptionTypes() {
        return get().getExceptionTypes();
    }

    public java.lang.reflect.Type[] getGenericExceptionTypes() {
        return get().getGenericExceptionTypes();
    }

    public String toGenericString() {
        return get().toGenericString();
    }

    public boolean isVarArgs() {
        return get().isVarArgs();
    }

    public boolean isSynthetic() {
        return get().isSynthetic();
    }

}
