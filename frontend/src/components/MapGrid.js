import React, {useState, useEffect} from 'react'
import Box from '@mui/material/Box';
import Grid from '@mui/material/Unstable_Grid2';
import Button from '@mui/material/Button';

export default function FullBorderedGrid() {
    const [gridColor, setGridColor] = useState([250])

    const addColor = (e, index) => {
      setGridColor(datas=>({
        ...datas,
        [index]: "Green"
     }))
    }


  return (
    <Box sx={{ flexGrow: 1, p: 2 }}>
      <Grid
        container
        spacing={2}
        sx={{
          '--Grid-borderWidth': '1px',
          borderTop: 'var(--Grid-borderWidth) solid',
          borderLeft: 'var(--Grid-borderWidth) solid',
          borderColor: 'divider',
          '& > div': {
            borderRight: 'var(--Grid-borderWidth) solid',
            borderBottom: 'var(--Grid-borderWidth) solid',
            borderColor: 'divider',
          },
        }}
      >
        {[...Array(250)].map((_, index) => (
            <Button key={index} variant="outlined" onClick={(e) => addColor(e, index)} sx={{ backgroundColor: gridColor[index]}} >
                <Grid key={index} {...{ xs: 1, sm: 1, md: 1, lg: 1 }} minHeight={30}  />
            </Button>
        ))}
      </Grid>
    </Box>
  );
}