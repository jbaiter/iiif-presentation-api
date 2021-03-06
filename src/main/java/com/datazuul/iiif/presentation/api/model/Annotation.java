/*
 * Copyright 2015 Ralf Eichinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datazuul.iiif.presentation.api.model;

import com.datazuul.iiif.presentation.api.model.other.Metadata;
import com.datazuul.iiif.presentation.api.model.other.Thumbnail;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * <p>
 * Recommended URI Pattern: {scheme}://{host}/{prefix}/{identifier}/annotation/{name}</p>
 *
 * @author Ralf Eichinger
 */
public class Annotation extends AbstractIiifResource {

    private String description; // optional
    private String label; // optional
    private List<Metadata> metadata; // optional
    private Thumbnail thumbnail; // optional
    private String viewingHint; // optional

    public Annotation() {
        type = "oa:Annotation";
    }

    /**
     * Convenience constructor (as id and label are optional)
     * @param id unique id of resource
     * @param label label of the Annotation
     */
    public Annotation(URI id, String label) {
        this();
        this.label = label;
        this.id = id;
    }

    public Annotation(String id, String label) throws URISyntaxException {
        this(new URI(id), label);
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getViewingHint() {
        return viewingHint;
    }

    public void setViewingHint(String viewingHint) {
        this.viewingHint = viewingHint;
    }
}
