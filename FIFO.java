
        // Stores block id of the 
        // block allocated to a process
        int allocation[] = new int[n];
    
        // Initially no block is assigned to any process
        for (int i = 0; i < allocation.length; i++)
            allocation[i] = -1;
    
        // pick each process and find suitable blocks
        // according to its size ad assign to it
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (blockSize[j] >= processSize[i])
                {
                    // allocate block j to p[i] process
                    allocation[i] = j;
    
                    // Reduce available memory in this block.
                    blockSize[j] -= processSize[i];
    
                    break;
