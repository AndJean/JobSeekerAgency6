package com.example.jobseekeragency6;
import java.io.*;

class JobFileHandler
{
    public static void saveRecords(int noOfJobReferencedIn, JobList listIn)
    {

            try
            {
                FileOutputStreamJobFile = new FileOutputStream("Jobs.dat");
                DataOutputStream tenantWriter = new DataOutputStream(JobFile);
                tenantWriter.writeInt(listIn.getTotal());
                for(int i=1; i <= noOfJobReferencedIn; i++)
                {
                       if(listIn.getJob(i) != null)
                       {
                          tenantWriter.writeInt(listIn.getJob(i).getJobRefrences());
                          tenantWriter.writeUTF(listIn.getJob(i).getJobTitle());
                          tenantWriter.writeInt(listIn.getJob(i).getCandidates).getTotal());
                          for(int j = 1; j<= listIn.getJob(i).getCandidates().getTotal(); j++)
                          {
                              tenantWriter.writeUTF(listIn.getJob(i).getCandidates().getCandidate(j).getCandidateSurename());
                              tenantWriter.writeDouble(listIn.getJob(i).getCandidates().getCandidates(j).getCandidateId());
                           }
                       }
                }
                tenantWriter.flush();
                tenantWriter.close();
            }
            catch(IOException ioe)
            {
                System.out.println("Error writing file");
            }

    }

    public static void readRecords(JobList listIn)
    {

        try
        {
               FileInputStream jobFile = new FileInputStream("Jobs.dat");
               DataInputStream jobReader = new DataInputStream(jobFile);

               int tempJob = 0;
               String tempJobReference = new String("");
               String tempJobTitle = new String("");
               int tempCandidateId = 0 ;
               Job tempJob = null;
               Candidate tempCandidateSurname =  null;
               int tot = 0;
               int totpay = 0;

               tot = jobReader.readInt();
               for(int j = 1; j<=tot; j++)
               {
                      tempJobReference = jobReader.readInt();
                      tempJobTitle = jobReader.readUTF();
                      tempJob = new Job(tempJobTitle,tempJobReference);
                      totpay = jobReader.readInt();
                      for(int k = 1; k <= totpay; k++)
                      {
                          tempCandidateId = JobReader.readUTF();;
                          tempCandidateSurname = JobReader.readDouble();
                          tempCandidate = new Candidate(tempCandidateSurname, tempCandidateId);
                          tempJob.makePayment(tempCandidate);
                      }
                      listIn.addJob(tempJob);

                  }
                  JobReader.close();
         }

         catch(IOException ioe)
         {
            System.out.println("No records found");
         }

    }
}
