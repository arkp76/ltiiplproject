
export class Match {
<<<<<<< HEAD
 matchId:number;
 firstTeamId:number;
 secondTeamId:number;
 matchDate:Date;
 venue: string;
 result:string;
 status:string;
 winnerTeamId:number;
 constructor(matchId:number,firstTeamId:number,secondTeamId:number,matchDate:Date,venue: string,result:string,status:string,winnerTeamId:number){
        this.matchId=matchId;
        this.firstTeamId=firstTeamId;
 this.secondTeamId =secondTeamId;
 this.matchDate = matchDate;
this.venue = venue;
this.result= result;
this.status = status;
this.winnerTeamId= winnerTeamId;
    }
    displayInfo():void{
        console.log(`Match ID: ${this.matchId}`);
        console.log(`Match date: ${this.matchDate}`);
        console.log(`Venue: ${this.venue}`);
      }
=======
 
>>>>>>> f8df9d574a9e90305800176f3d27753e146d0d04
}