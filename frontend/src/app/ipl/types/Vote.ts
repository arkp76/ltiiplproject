
export class Vote {
<<<<<<< HEAD
    voteId: number;
    email: string;
    category: string;
    cricketerId: number;
    teamId: number;
    constructor(voteId: number,
        email: string,
        category: string,
        cricketerId: number,
        teamId: number) {
        this.voteId = voteId;
        this.email =email;
        this.category = category;
        this.cricketerId = cricketerId;
        this.teamId = teamId;
    }
    displayInfo():void{
    console.log(`Vote ID: ${this.voteId}`);
    console.log(`Email: ${this.email}`);
    }
=======

>>>>>>> f8df9d574a9e90305800176f3d27753e146d0d04
}