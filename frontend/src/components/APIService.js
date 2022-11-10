export default class APIService {

    static async getAllRecipes() {
        const response = await fetch("/data/get", {
            "method":"GET",
            headers: {
              "Content-Type":"application/json"
            }
          })
          .then(response => {
            if(response.status === 200) {
              return response.json()
            }
          })
          
          return await response
    }

}