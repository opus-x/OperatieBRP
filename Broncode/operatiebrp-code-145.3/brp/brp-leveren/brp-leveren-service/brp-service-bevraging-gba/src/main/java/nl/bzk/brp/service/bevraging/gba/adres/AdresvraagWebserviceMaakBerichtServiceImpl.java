/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.bevraging.gba.adres;


import javax.inject.Inject;
import nl.bzk.brp.service.algemeen.autorisatie.LeveringsautorisatieValidatieService;
import nl.bzk.brp.service.algemeen.autorisatie.PartijService;
import nl.bzk.brp.service.bevraging.gba.generiek.AbstractMaakBerichtServiceImpl;
import nl.bzk.brp.service.bevraging.gba.generiek.ValideerGbaAutorisatieService;
import nl.bzk.brp.service.bevraging.zoekpersoongeneriek.ValideerZoekCriteriaService;
import nl.bzk.brp.service.bevraging.zoekpersoongeneriek.ZoekPersoon;
import org.springframework.stereotype.Service;


/**
 * Implementatie {@link nl.bzk.brp.service.bevraging.algemeen.Bevraging.MaakBerichtService} voor GBA
 * Webservice (adres)vraag.
 */
@Service
public final class AdresvraagWebserviceMaakBerichtServiceImpl extends AbstractMaakBerichtServiceImpl<AdresvraagWebserviceVerzoek> {

    /**
     * Constructor.
     * @param leveringsautorisatieService de leveringsautorisatie validatieservice
     * @param partijService de partij service
     * @param valideerZoekPersoonZoekCriteriaService validatie service voor de zoek criteria in brp
     * @param valideerGbaAutorisatieService valideer gba autorisatie service
     * @param zoekPersoonOphalenPersoonService zoek persoon ophalen service
     */
    @Inject
    public AdresvraagWebserviceMaakBerichtServiceImpl(final LeveringsautorisatieValidatieService leveringsautorisatieService,
                                                      final PartijService partijService,
                                                      final ValideerZoekCriteriaService<AdresvraagWebserviceVerzoek>
                                                              valideerZoekPersoonZoekCriteriaService,
                                                      final ValideerGbaAutorisatieService valideerGbaAutorisatieService,
                                                      final ZoekPersoon.OphalenPersoonService<AdresvraagWebserviceVerzoek>
                                                              zoekPersoonOphalenPersoonService) {
        super(leveringsautorisatieService,
                partijService,
                valideerZoekPersoonZoekCriteriaService,
                valideerGbaAutorisatieService,
                zoekPersoonOphalenPersoonService);
    }

    @Override
    protected String getDienstSpecifiekeLoggingString() {
        return "Zoek Persoon op adres via Webservice (GBA)";
    }
}
