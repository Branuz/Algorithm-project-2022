export default class APIService {

    static async getAllRecipes(body) {
        const response = await fetch("/data/get", {
            "method":"POST",
            headers: {
              "Content-Type":"application/json"
            },
            body: JSON.stringify(body)
          })
          .then(response => {
            if(response.status === 200) {
              return response.json()
            }
          })
          
          return await response
    }
}