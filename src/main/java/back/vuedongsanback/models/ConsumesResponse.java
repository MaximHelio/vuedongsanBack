package back.vuedongsanback.models;

import java.util.List;

    public class ConsumesResponse {
        public String result;
        private List<Consume> consumes;

        public ConsumesResponse(){
            this.result = result;
        }

        public ConsumesResponse(String result, List<Consume> consumes) {
            this.result = result;
            this.consumes = consumes;
        }
    }
