/*
 * Copyright 2012 XENEO.
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
package org.xeneo.web.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.xeneo.core.task.Case;
import org.xeneo.core.task.CaseEngine;

/**
 *
 * @author XENEO
 */

@Component("taskcreatebean")
@Scope("request")
public class TaskCreateBean {
    
 
    
    String titel;
    String description;

    public String getDescription() {
        return description;
    }

    public String getTitel() {
        return titel;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    
    public String createTask(){
    
       
        return "/";
    }
}
   